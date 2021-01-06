package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
    public void addSkills(String nameAndLevel) {

            name = nameAndLevel.substring(0, nameAndLevel.indexOf(" "));
        int level = Integer.parseInt(nameAndLevel.substring(nameAndLevel.length()-1,nameAndLevel.length()));
            skills.add(new Skill(name, level));
        }


    public int findSkill(String name) {
        for (Skill item : skills) {
            if (name.equals(item.getName())) {
                return item.getLevel();
            }
        }
        return 0;
    }
}
