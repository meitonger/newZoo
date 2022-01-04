public abstract class Animals implements InfoReader {

    protected String animalNames;
    protected String animalColor;
    protected int animalAge;

    public Animals() {

    }

    public Animals(String animalNames, String animalColor, int animalAge) {
        this.animalNames = animalNames;
        this.animalColor = animalColor;
        this.animalAge = animalAge;
    }

    public String getName() {
        return animalNames;
    }

    public void setName(String animalNames) {
        this.animalNames = animalNames;
    }

    public String getColor() {
        return animalColor;
    }

    public void setColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getAge() {
        return animalAge;
    }

    public void setAge(int animalAge) {
        this.animalAge = animalAge;
    }




}
