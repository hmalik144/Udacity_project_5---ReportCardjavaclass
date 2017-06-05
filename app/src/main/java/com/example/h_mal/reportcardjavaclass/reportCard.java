package com.example.h_mal.reportcardjavaclass;

/**
 * Created by h_mal on 14/01/2017.
 */

public class reportCard {

    /** Student name */
    private String mStudentName;

    /** Student year group */
    private String mStudentYear;

    /** Student overall grade */
    private int mStudentGrade;

    public reportCard (String name, String year, int grade){
        mStudentName = name;
        mStudentYear = year;
        mStudentGrade = grade;
    }

    /**get student name*/
    public String getStudentName(){
        return mStudentName;
    }
    /**set student name*/
    public void setStudentName(String name) {
        mStudentName = name;

    }
    /**get student year*/
    public String getStudentYear(){
        return mStudentYear;
    }
    /**set student year*/
    public void setStudentyear(String year) {
        mStudentYear = year;
    }

    /** get student overall grade*/
    public int getStudentGrade(){
        return mStudentGrade;
    }
    /**set student overall grade*/
    public void setStudentGrade(int grade) {
        mStudentGrade = grade;
    }

    @Override
    public String toString(){
        return "Student Name: " + mStudentName +"\n" +
                "Year: " + mStudentYear +"\n" +
                "Overall Grade: " + mStudentGrade;
    }

}
