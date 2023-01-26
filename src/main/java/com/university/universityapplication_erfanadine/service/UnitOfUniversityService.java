package com.university.universityapplication_erfanadine.service;

import com.university.universityapplication_erfanadine.dto.LessonDto;
import com.university.universityapplication_erfanadine.dto.UnitOfUniversityDto;
import com.university.universityapplication_erfanadine.entity.UnitOfUniversity;
import com.university.universityapplication_erfanadine.repository.TeacherRepo;
import com.university.universityapplication_erfanadine.repository.UnitOfUniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitOfUniversityService {

    @Autowired
    private UnitOfUniversityRepo unitOfUniversityRepo;


    private UnitOfUniversityDto save(UnitOfUniversityDto unitOfUniversityDto) {
        return convertUnitOfUniversityModelToUnitOfUniversityDto(unitOfUniversityRepo.save(convertUnitOfUniversityDtoToUnitOfUniversityModel(unitOfUniversityDto)));
    }

    private UnitOfUniversityDto update(UnitOfUniversityDto unitOfUniversityDto) {
        return convertUnitOfUniversityModelToUnitOfUniversityDto(unitOfUniversityRepo.save(convertUnitOfUniversityDtoToUnitOfUniversityModel(unitOfUniversityDto)));
    }

    private UnitOfUniversityDto findById(Long id) {
        return convertUnitOfUniversityModelToUnitOfUniversityDto(unitOfUniversityRepo.findById(id).orElseThrow(() ->
                new RuntimeException("not found  Unit Of university by this id : " + id)));
    }

    private UnitOfUniversityDto findByName(String nameOfUnit) {
        return convertUnitOfUniversityModelToUnitOfUniversityDto(unitOfUniversityRepo.findByNameOfUniversity_Unit(nameOfUnit).orElseThrow(() ->
                new RuntimeException("not found Unit Of university by this name : " + nameOfUnit)));
    }


    public UnitOfUniversityDto convertUnitOfUniversityModelToUnitOfUniversityDto(UnitOfUniversity unitOfUniversity) {

        if (unitOfUniversity == null) {
            return null;
        }

        UnitOfUniversityDto unitOfUniversityDto = new UnitOfUniversityDto();

        unitOfUniversityDto.setId(unitOfUniversity.getId());
        unitOfUniversityDto.setNameOfUniversity_Unit(unitOfUniversity.getNameOfUniversity_Unit());
        unitOfUniversityDto.setCodeOfUnit(unitOfUniversity.getCodeOfUnit());
        unitOfUniversityDto.setTeachers(unitOfUniversity.getTeachers());
        unitOfUniversityDto.setLessons(unitOfUniversity.getLessons());

        return unitOfUniversityDto;
    }


    public UnitOfUniversity convertUnitOfUniversityDtoToUnitOfUniversityModel(UnitOfUniversityDto unitOfUniversityDto) {

        if (unitOfUniversityDto == null) {
            return null;
        }

        UnitOfUniversity unitOfUniversity = new UnitOfUniversity();

        unitOfUniversity.setId(unitOfUniversityDto.getId());
        unitOfUniversity.setNameOfUniversity_Unit(unitOfUniversityDto.getNameOfUniversity_Unit());
        unitOfUniversity.setCodeOfUnit(unitOfUniversityDto.getCodeOfUnit());
        unitOfUniversity.setTeachers(unitOfUniversityDto.getTeachers());
        unitOfUniversity.setLessons(unitOfUniversityDto.getLessons());

        return unitOfUniversity;
    }
}
