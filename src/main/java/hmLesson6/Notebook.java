package hmLesson6;

import java.util.Objects;

public class Notebook {
    String productName;
    String brand;
    String country;
    String operatingSystem;
    String color;
    int numberOfСores;
    int ssdVolume;
    String ram;
    double screenDiagonal;
    double width;
    double height;
    double depth;

    public int getNumberOfСores() {
        return numberOfСores;
    }

    public Notebook(String productName, String brand, String country, String operatingSystem, String color,
                    int numberOfСores, int ssdVolume, String ram,
                    double screenDiagonal, double width, double height, double depth) {
        this.productName = productName;
        this.brand = brand;
        this.country = country;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.numberOfСores = numberOfСores;
        this.ssdVolume = ssdVolume;
        this.ram = ram;
        this.screenDiagonal = screenDiagonal;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("productName: ").append(productName).append("; ")
                .append("brand: ").append(brand).append("; ")
                .append("country: ").append(country).append("; ")
                .append("operatingSystem: ").append(operatingSystem).append("; ")
                .append("color: ").append(color).append("; ")
                .append("numberOfСores: ").append(numberOfСores).append("; ")
                .append("ssdVolume: ").append(ssdVolume).append("; ")
                .append("ram: ").append(ram).append("; ")
                .append("screenDiagonal: ").append(screenDiagonal).append("; ")
                .append("width: ").append(width).append("; ")
                .append("height: ").append(height).append("; ")
                .append("depth: ").append(depth).append(" ");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, brand, country, operatingSystem, numberOfСores,
                screenDiagonal, ssdVolume, color, ram, width, height, depth);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook temp = (Notebook) obj;
        return temp.numberOfСores == this.numberOfСores && temp.screenDiagonal == this.screenDiagonal
                && temp.ssdVolume == this.ssdVolume && temp.ram == this.ram && temp.width == this.width && temp.height == this.height
                && temp.depth == this.depth
                && temp.country.equals(this.country) && temp.productName.equals(this.productName) && temp.brand.equals(this.brand)
                && temp.operatingSystem.equals(this.operatingSystem) && temp.color.equals(this.color);
    }
}
