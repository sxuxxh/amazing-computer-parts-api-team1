package com.fseteam1.amazingcomputerparts.entity;

import javax.persistence.*;

//Define Entity
@Entity
@Table(name = "computer_parts")
public class ComputerPart {

    //Defined Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_part_id")
    private int computerPartId;

    @Column(name = "computer_part_name")
    private String computerPartName;

    @Column(name = "computer_part_type")
    private String computerPartType;

    @Column(name = "computer_part_brand")
    private String computerPartBrand;

    @Column(name = "computer_part_price")
    private double computerPartPrice;

    @Column(name = "computer_part_quantity")
    private int computerPartQuantity;

    //Default Constructor
    public ComputerPart() {
    }

    //Parameter Constructor
    public ComputerPart(String computerPartName, String computerPartType, String computerPartBrand, double computerPartPrice, int computerPartQuantity) {
        this.computerPartName = computerPartName;
        this.computerPartType = computerPartType;
        this.computerPartBrand = computerPartBrand;
        this.computerPartPrice = computerPartPrice;
        this.computerPartQuantity = computerPartQuantity;
    }

    //Getters and Setters
    public int getComputerPartId() {
        return computerPartId;
    }

    public void setComputerPartId(int computerPartId) {
        this.computerPartId = computerPartId;
    }

    public String getComputerPartName() {
        return computerPartName;
    }

    public void setComputerPartName(String computerPartName) {
        this.computerPartName = computerPartName;
    }

    public String getComputerPartType() {
        return computerPartType;
    }

    public void setComputerPartType(String computerPartType) {
        this.computerPartType = computerPartType;
    }

    public String getComputerPartBrand() {
        return computerPartBrand;
    }

    public void setComputerPartBrand(String computerPartBrand) {
        this.computerPartBrand = computerPartBrand;
    }

    public double getComputerPartPrice() {
        return computerPartPrice;
    }

    public void setComputerPartPrice(double computerPartPrice) {
        this.computerPartPrice = computerPartPrice;
    }

    public int getComputerPartQuantity() {
        return computerPartQuantity;
    }

    public void setComputerPartQuantity(int computerPartQuantity) {
        this.computerPartQuantity = computerPartQuantity;
    }

    //ToString
    @Override
    public String toString() {
        return "ComputerPart{" +
                "computerPartId=" + computerPartId +
                ", computerPartName='" + computerPartName + '\'' +
                ", computerPartType='" + computerPartType + '\'' +
                ", computerPartBrand='" + computerPartBrand + '\'' +
                ", computerPartPrice=" + computerPartPrice +
                ", computerPartQuantity=" + computerPartQuantity +
                '}';
    }
}
