public class Pilot {
    public String name;
    public String constructor;
    public String country;
    public Integer carnumber;
    // adicionar data de nascimento
    public Integer age;
    public Double height;
    public Integer w_champ;
    public Integer victories;
    public Integer pole_pos;
    public Double points;
    public Double fstlap;

    public Pilot(String name, String constructor, String country, Integer age, Double height, Integer w_champ, Integer victories, Integer pole_pos, Double points, Double fstlap) {
        this.name = name;
        this.constructor = constructor;
        this.country = country;
        this.carnumber = carnumber;
        this.age = age;
        this.height = height;
        this.w_champ = w_champ;
        this.victories = victories;
        this.pole_pos = pole_pos;
        this.points = points;
        this.fstlap = fstlap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getW_champ() {
        return w_champ;
    }

    public void setW_champ(Integer w_champ) {
        this.w_champ = w_champ;
    }

    public Integer getVictories() {
        return victories;
    }

    public void setVictories(Integer victories) {
        this.victories = victories;
    }

    public Integer getPole_pos() {
        return pole_pos;
    }

    public void setPole_pos(Integer pole_pos) {
        this.pole_pos = pole_pos;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Double getFstlap() {
        return fstlap;
    }

    public void setFstlap(Double fstlap) {
        this.fstlap = fstlap;
    }

    public Integer getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }
}
