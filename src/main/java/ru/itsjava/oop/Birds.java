package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Birds {
    private final String name;
    private boolean isHomey;

//    public String getName() {
//        return this.name;
//    }
//
//    public boolean isHomey() {
//        return this.isHomey;
//    }
//
//    public void setHomey(boolean isHomey) {
//        this.isHomey = isHomey;
//    }
//
//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Birds)) return false;
//        final Birds other = (Birds) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$name = this.getName();
//        final Object other$name = other.getName();
//        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
//        if (this.isHomey() != other.isHomey()) return false;
//        return true;
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Birds;
//    }
//
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $name = this.getName();
//        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
//        result = result * PRIME + (this.isHomey() ? 79 : 97);
//        return result;
//    }
//
//    public String toString() {
//        return "Birds(name=" + this.getName() + ", isHomey=" + this.isHomey() + ")";
//    }
//
//    public Birds(String name, boolean isHomey) {
//        this.name = name; // ссылаемся на поле конкретного объекта
//        this.isHomey = isHomey;
//    }
//
//    public String toString() {
//        return "{ name:" + name + " isHomey:" + isHomey + "}";
//    }
//
//
//    @Override
//    public boolean equals(Object o) { // на входе Object
//        if (this == o) return true; //если мы ссылаемся на один и тот же объект, то true
//        // рефлексивность = объект равен сам себе
//        if (o == null || getClass() != o.getClass()) return false;
//        // мы проверяем не является ли объект экземпляром другого класса
//
//        Birds birds = (Birds) o; // мы явно приводим тип данных (на отвестственности программиста)
//
//        if (isHomey != birds.isHomey) return false; // если не совпадают isHomey, то false
//        return name.equals(birds.name); // если совпадают isHomey, сравниваем поле name (класс String)
//        /// через метод equals. Метод equals переопредеден в классе String
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode(); //хэш  код name
//    }
}

