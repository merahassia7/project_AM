package com.example.umbbmobguide;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Faculty> getFaculties() {

        ArrayList<Faculty> faculties = new ArrayList<>();

        // ================= Faculty of Technology =================
        ArrayList<Department> tech = new ArrayList<>();
        tech.add(new Department(
                "Mechanical Engineering",
                "Study of machines and mechanical systems.",
                "024912951",
                "mech@umbb.dz",
                "Boumerdes"
        ));
        tech.add(new Department(
                "Civil Engineering",
                "Construction and infrastructure engineering.",
                "024912951",
                "civil@umbb.dz",
                "Boumerdes"
        ));
        tech.add(new Department(
                "Electrical Engineering",
                "Electricity and electronic systems.",
                "024912951",
                "elec@umbb.dz",
                "Boumerdes"
        ));
        tech.add(new Department(
                "Process Engineering",
                "Industrial and chemical processes.",
                "024912951",
                "process@umbb.dz",
                "Boumerdes"
        ));

        faculties.add(new Faculty(
                "Faculty of Technology",
                "Engineering and technical studies.",
                tech
        ));

        // ================= Faculty of Sciences =================
        ArrayList<Department> sci = new ArrayList<>();
        sci.add(new Department(
                "Mathematics",
                "Pure and applied mathematics.",
                "024912951",
                "math@umbb.dz",
                "Boumerdes"
        ));
        sci.add(new Department(
                "Physics",
                "Fundamental and applied physics.",
                "024912951",
                "physics@umbb.dz",
                "Boumerdes"
        ));
        sci.add(new Department(
                "Chemistry",
                "Chemical sciences and applications.",
                "024912951",
                "chem@umbb.dz",
                "Boumerdes"
        ));
        sci.add(new Department(
                "Biology",
                "Life sciences and biology.",
                "024912951",
                "bio@umbb.dz",
                "Boumerdes"
        ));
        sci.add(new Department(
                "Computer Science",
                "Software engineering, artificial intelligence and data science.",
                "024912951",
                "info@umbb.dz",
                "Boumerdes"
        ));

        faculties.add(new Faculty(
                "Faculty of Sciences",
                "Scientific studies and research.",
                sci
        ));

        // ================= Faculty of Economics =================
        ArrayList<Department> eco = new ArrayList<>();
        eco.add(new Department(
                "Economics",
                "Economic theory and analysis.",
                "024912951",
                "eco@umbb.dz",
                "Boumerdes"
        ));
        eco.add(new Department(
                "Management",
                "Business management and administration.",
                "024912951",
                "manage@umbb.dz",
                "Boumerdes"
        ));
        eco.add(new Department(
                "Finance and Accounting",
                "Finance systems and accounting.",
                "024912951",
                "finance@umbb.dz",
                "Boumerdes"
        ));

        faculties.add(new Faculty(
                "Faculty of Economics",
                "Economics and management sciences.",
                eco
        ));

        // ================= Faculty of Law =================
        ArrayList<Department> law = new ArrayList<>();
        law.add(new Department(
                "Public Law",
                "Public legal systems.",
                "024912951",
                "law@umbb.dz",
                "Boumerdes"
        ));
        law.add(new Department(
                "Private Law",
                "Private legal systems.",
                "024912951",
                "law@umbb.dz",
                "Boumerdes"
        ));

        faculties.add(new Faculty(
                "Faculty of Law",
                "Legal studies and political sciences.",
                law
        ));

        // ================= Faculty of Letters =================
        ArrayList<Department> let = new ArrayList<>();
        let.add(new Department(
                "Arabic Language",
                "Arabic language and literature.",
                "024912951",
                "arabic@umbb.dz",
                "Boumerdes"
        ));
        let.add(new Department(
                "Foreign Languages",
                "English and other languages.",
                "024912951",
                "lang@umbb.dz",
                "Boumerdes"
        ));

        faculties.add(new Faculty(
                "Faculty of Letters",
                "Languages and humanities.",
                let
        ));

        return faculties;
    }
}
