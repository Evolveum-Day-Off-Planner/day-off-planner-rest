package com.evolveum.day_off_planner_rest.service

import com.evolveum.day_off_planner_rest.data.entity.Setting
import com.evolveum.day_off_planner_rest.data.enums.SettingType
import com.evolveum.day_off_planner_rest.data.repository.SettingRepository
import com.evolveum.day_off_planner_rest.exception.NotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.PostConstruct

@Service
@Transactional
class SettingService(private val settingRepository: SettingRepository) {

    fun getSettingByKey(key: String): Setting = settingRepository.findOneByKey(key) ?: throw NotFoundException("Setting with key $key was not found")

    fun getSettingByType(type: SettingType): Setting = getSettingByKey(type.key)

    fun getWorkDayRange(): Pair<Int, Int> {
        val dayStart = getSettingByType(SettingType.WORKDAY_START).getValueWithThrow()
        val dayLength = getSettingByType(SettingType.WORKDAY_LENGTH).getValueWithThrow()
        val dayEnd = maxOf(dayStart + dayLength, 23) // should not exceed 23 (11 + 12)

        return Pair(dayStart, dayEnd)
    }

    @PostConstruct
    fun initSettings() {
        SettingType.values().forEach { type ->
            if (settingRepository.findOneByKey(type.key) == null) {
                settingRepository.save(Setting(type))
            }
        }
    }
}