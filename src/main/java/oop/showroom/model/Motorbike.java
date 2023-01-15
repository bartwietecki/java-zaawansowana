package oop.showroom.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oop.showroom.model.enums.*;

@Getter
@Setter
@NoArgsConstructor
public class Motorbike extends Vehicle {
    private MotorbikeType motorbikeType;
    private String motorbikeDrive;

    // konstruktor poniżej :
    public Motorbike(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
                     GearboxType gearboxType, boolean isUsed, MotorbikeType motorbikeType, String motorbikeDrive) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.motorbikeType = motorbikeType;
        this.motorbikeDrive = motorbikeDrive;
    }

    @Override
    public Object getSimpleVehicle(){
        return new SimpleMotorbike(this);
    }

    @Override
    public String toString() {
        return "Motorbike {" +
                "Brand: " + super.getBrand() +
                ", Model: " + super.getModel() +
                ", Colour: " + super.getColour() +
                ", Engine: " + super.getEngine() +
                ", Mileage: " + super.getMileage() +
                ", GearBox Type: " + super.getGearboxType() +
                ", Used: " + super.isUsed() +
                ", Motorbike Type: " + motorbikeType +
                ", Motorbike Drive: " + motorbikeDrive +
                "} ";
    }


    static class SimpleMotorbike{
        private final BrandType brandType;
        private final MotorbikeType motorbikeType;

        public SimpleMotorbike(Motorbike motorbike) {
            this.brandType = motorbike.getBrand();
            this.motorbikeType = motorbike.getMotorbikeType();
        }

        @Override
        public String toString() {
            return "SimpleMotorbike{" +
                    "brandType=" + brandType +
                    ", motorbikeType=" + motorbikeType +
                    '}';
        }
    }
}


