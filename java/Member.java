package org.iesfm.library;

import java.util.Objects;

public class Member {

    private String nif;
    private int numMember;
    private String name;
    private String surnames;
    private int cp;

    public Member(String nif, int numMember, String name, String surnames, int cp) {
        this.nif = nif;
        this.numMember = numMember;
        this.name = name;
        this.surnames = surnames;
        this.cp = cp;
    }

    public boolean isFrom(int cp) {
        return this.cp == cp;
    }


    public void info() {
        System.out.println(name + " " + surnames + ". NIF: " + nif + ". Número socio: " + numMember + ". CP:" + cp);
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

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return numMember == member.numMember && cp == member.cp && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surnames, member.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, numMember, name, surnames, cp);
    }

    @Override
    public String toString() {
        return "Member{" +
                "nif='" + nif + '\'' +
                ", numMember=" + numMember +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", cp=" + cp +
                '}';
    }

}
