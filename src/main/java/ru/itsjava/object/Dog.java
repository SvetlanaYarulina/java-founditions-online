package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
public class Dog {
    private final String nickname;
    private int pawsCount;
//
//    public Dog(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public Dog(String nickname, int pawsCount) {
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }
//
//    public String getNickname() {
//        return this.nickname;
//    }
//
//    public int getPawsCount() {
//        return this.pawsCount;
//    }
//
//    public void setPawsCount(int pawsCount) {
//        this.pawsCount = pawsCount;
//    }
//
//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Dog)) return false;
//        final Dog other = (Dog) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$nickname = this.getNickname();
//        final Object other$nickname = other.getNickname();
//        if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname)) return false;
//        if (this.getPawsCount() != other.getPawsCount()) return false;
//        return true;
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Dog;
//    }
//
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $nickname = this.getNickname();
//        result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
//        result = result * PRIME + this.getPawsCount();
//        return result;
//    }
//
//    public String toString() {
//        return "Dog(nickname=" + this.getNickname() + ", pawsCount=" + this.getPawsCount() + ")";
//    }
//
//    public Dog(String nickname, int pawsCount){
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Dog dog = (Dog) o;
//
//        if (pawsCount != dog.pawsCount) return false;
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        return nickname.hashCode();
//    }
//    @Override
//    public String toString (){
//        return "Dog { nickname:" + nickname + " paws:"+ pawsCount + "}";
//
//    }
//
//    public void setPawsCount(int pawsCount) {
//        this.pawsCount = pawsCount;
//    }
}
