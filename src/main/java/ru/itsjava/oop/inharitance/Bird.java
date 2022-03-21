package ru.itsjava.oop.inharitance;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bird {
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
//        if (!(o instanceof Bird)) return false;
//        final Bird other = (Bird) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$name = this.getName();
//        final Object other$name = other.getName();
//        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
//        if (this.isHomey() != other.isHomey()) return false;
//        return true;
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Bird;
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
    @Override
    public String toString() {
        return "Bird(name=" + this.getName() + ", isHomey=" + this.isHomey() + ")";
    }
//
//    public Bird(String name, boolean isHomey) {
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
//        Bird bird = (Bird) o; // мы явно приводим тип данных (на отвестственности программиста)
//
//        if (isHomey != bird.isHomey) return false; // если не совпадают isHomey, то false
//        return name.equals(bird.name); // если совпадают isHomey, сравниваем поле name (класс String)
//        /// через метод equals. Метод equals переопредеден в классе String
    //Провалились в equals:
    //public boolean equals(Object anObject) {
    //if (this == anObject) { если ссылаемся на поле одного и того же объекта, то true
    //return true;
    //}
    //if (anObject instanceof String) {
    //Оператор instanceof нужен, чтобы проверить, был ли объект, создан на основе класса String, если да то:
    //String aString = (String)anObject;
    //if (coder() == aString.coder()) {
    //сравниваем формат кодирования и сравниваем символ за символом
    //return isLatin1() ? StringLatin1.equals(value, aString.value) : StringUTF16.equals(value, aString.value);
    //value Используется для хранения символов
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode(); // стандартный хеш-код из класса String
////    }
}

