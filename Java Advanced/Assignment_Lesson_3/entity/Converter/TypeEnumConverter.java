/*
package org.example.entity.Converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.example.entity.Enums.TypeEnum;

@Converter(autoApply = false)
public class TypeEnumConverter implements AttributeConverter<TypeEnum, String> {
    @Override
    public String convertToDatabaseColumn(TypeEnum attribute) {
        if (attribute == null) return null;
        return String.valueOf(attribute.getValue()); // Lưu "0" hoặc "1"
    }

    @Override
    public TypeEnum convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        dbData = dbData.trim();
        switch (dbData) {
            case "0": return TypeEnum.ESAY;
            case "1": return TypeEnum.MULTIPLE_CHOICE;
            default: throw new IllegalArgumentException("Unknown value: " + dbData);
        }
    }
}
*/
