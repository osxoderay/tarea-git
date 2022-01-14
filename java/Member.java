package org.iesfm.library;

import java.util.Objects;

public class Member {

    private String nif;
    private int numMember;
    private String name;
    private String surnames;

    public Member(String nif, int numMember, String name, String surnames) {
        this.nif = nif;
        this.numMember = numMember;
        this.name = name;
        this.surnames = surnames;
    }

    public void info() {
        System.out.println(name + " " + surnames + ". NIF: " + nif + ". Número socio: " + numMember);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumMember() {
        return numMember;
    }

    public void setNumMember(int numMember) {
        this.numMember = numMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return numMember == member.numMember && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surnames, member.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, numMember, name, surnames);
    }

    @Override
    public String toString() {
        return "Member{" +
                "nif='" + nif + '\'' +
                ", numMember=" + numMember +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                '}';
    }

}
