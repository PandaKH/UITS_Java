
package jv1607.homeworks.task_0.task_6;

public class House {
    private int id;
    private int numHouse;
    private int area;
    private int floors;
    private int rooms;
    private String street;
    private String typeBuild;
    private String lifetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeBuild() {
        return typeBuild;
    }

    public void setTypeBuild(String typeBuild) {
        this.typeBuild = typeBuild;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    public House() {
    }

    public House(int id, int numHouse, int area, int floors, int rooms, String street, String typeBuild, String lifetime) {
        this.id = id;
        this.numHouse = numHouse;
        this.area = area;
        this.floors = floors;
        this.rooms = rooms;
        this.street = street;
        this.typeBuild = typeBuild;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", numHouse=" + numHouse + ", area=" + area + ", floors=" + floors + ", rooms=" + rooms + ", street=" + street + ", typeBuild=" + typeBuild + ", lifetime=" + lifetime + '}';
    }
    
}
