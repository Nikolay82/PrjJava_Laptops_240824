import java.util.Objects;

public class Laptop {
    private String serialNum = null;
    private String brend = null;
    private String model = null;
    private String colour = null;
    private String operSystem = null;
    private String diagonal = null;
    private String ram = null; //ГБ
    private String memoryHdd = null; //ГБ

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemoryHdd() {
        return memoryHdd;
    }

    public void setMemoryHdd(String memoryHdd) {
        this.memoryHdd = memoryHdd;
    }

    @Override
    public String toString() {
        return "{" +
                "Серийный номер='" + serialNum + '\'' +
                ", Бренд='" + brend + '\'' +
                ", Модель='" + model + '\'' +
                ", Цвет='" + colour + '\'' +
                ", Диагональ='" + diagonal + '\'' +
                ", ОС='" + operSystem + '\'' +
                ", ОЗУ(ГБ)='" + ram + '\'' +
                ", Память HDD(ГБ)='" + memoryHdd + '\'' +
                '}';
    }

    public String toStringWithoutNull() {
        String strRes = "{";
        strRes += (serialNum != null) ? " Серийный номер=" + serialNum : "";
        strRes += (brend != null) ? " Бренд=" + brend : "";
        strRes += (model != null) ? " Модель=" + model : "";
        strRes += (colour != null) ? " Цвет=" + colour : "";
        strRes += (diagonal != null) ? " Диагональ=" + diagonal : "";
        strRes += (operSystem != null) ? " ОС=" + operSystem : "";
        strRes += (ram != null) ? " ОЗУ(ГБ)=" + ram : "";
        strRes += (memoryHdd != null) ? " Память HDD(ГБ)=" + memoryHdd : "";
        strRes += "}";
        return strRes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Laptop laptop = (Laptop) obj;
        if ((laptop.serialNum != null) && (!serialNum.equals(laptop.serialNum))) return false;
        if ((laptop.brend != null) && (!brend.equals(laptop.brend))) return false;
        if ((laptop.model != null) && (!model.equals(laptop.model))) return false;
        if ((laptop.colour != null) && (!colour.equals(laptop.colour))) return false;
        if ((laptop.diagonal != null) && (!diagonal.equals(laptop.diagonal))) return false;
        if ((laptop.operSystem != null) && (!operSystem.equals(laptop.operSystem))) return false;
        if ((laptop.ram != null) && (!ram.equals(laptop.ram))) return false;
        if ((laptop.memoryHdd != null) && (!memoryHdd.equals(laptop.memoryHdd))) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNum, brend, model, colour, operSystem, diagonal, ram, memoryHdd);
    }
}
