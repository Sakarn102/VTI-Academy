//package org.example.entity.Converter;
//
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//import org.example.entity.Enums.SalaryEnum;
//
//@Converter(autoApply = true)
//public class SalaryEnumConverter implements AttributeConverter<SalaryEnum, String> {
//    @Override
//    public String convertToDatabaseColumn(SalaryEnum attribute) {
//        if (attribute == null) return null;
//        return String.valueOf(attribute.getValue());
//    }
//
//    @Override
//    public SalaryEnum convertToEntityAttribute(String dbData) {
//        if (dbData == null) return null;
//        switch (dbData) {
//            case "600": return SalaryEnum.DEV;
//            case "700": return SalaryEnum.TEST;
//            case "1500": return SalaryEnum.SCRUM_MASTER;
//            case "2000": return SalaryEnum.PM;
//            default: throw new IllegalArgumentException("Unknown value: " + dbData);
//        }
//    }
//}
