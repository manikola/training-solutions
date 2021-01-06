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
    public void addSkills(String... nameAndLevel) {
        for (String s : nameAndLevel) {
            String name = s.substring(0, s.indexOf(" ("));
            int level = Integer.parseInt(s.substring(s.lastIndexOf("(") + 1, s.indexOf(")")));
            skills.add(new Skill(name, level));
        }
    }


        public int findSkillLevelByName(String name) {
        for (Skill item :skills) {
            if (name.equals(item.getName())) {
                return item.getLevel();
            }
        }
        return 0;
    }
}

