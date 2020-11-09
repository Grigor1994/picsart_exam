package com.grigor.picsart.service;

import com.grigor.picsart.model.Plane;

public class PlaneService {
    public void printPlaneInfo(Plane plane) {
        System.out.print("Model: " + plane.getModel() + "\n Country: " + plane.getCountry() + " \n Year: " + plane.getYear()
                + "\n Hours: " + plane.getHours() + " \n Military: " + plane.isMilitary() + " \n Engine type: " + plane.getEngineType()
                + "\n  Weight: " + plane.getWeight() + " \n Wingspan: " + plane.getWingspan() + " \n Top Speed: " + plane.getTopSpeed()
                + "\n Seats: " + plane.getSeats() + "\n Cost: " + plane.getCost());
    }

    // print cost and topSpeed if the plane is military otherwise print model and country
    public void printCostAndTopSpeed(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost() + "\n Top Speed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel() + "\n Country: " + plane.getCountry());
        }
    }

    public void printNewerPlane(Plane plane1, Plane plane2) {
        if (plane1.getYear() > plane2.getYear()) {
            printPlaneInfo(plane2);
        } else {
            printPlaneInfo(plane1);
        }
    }

    public String getBiggerWingSpanPlane(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() > plane2.getWingspan()) return plane1.getModel();
        return plane2.getModel();
    }

    public void printHighestCostPlane(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getCost() > plane2.getCost() && plane1.getCost() > plane3.getCost()) {
            printPlaneInfo(plane1);
        } else if (plane2.getCost() > plane1.getCost() && plane2.getCost() > plane3.getCost()) {
            printPlaneInfo(plane2);
        } else if (plane3.getCost() > plane1.getCost() && plane3.getCost() > plane2.getCost()) {
            printPlaneInfo(plane3);
        } else {
            printPlaneInfo(plane1);
        }
    }

    public void printSmallestSeatsCountOfPlane(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            printPlaneInfo(plane1);
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            printPlaneInfo(plane2);
        } else if (plane3.getSeats() < plane1.getSeats() && plane3.getSeats() < plane2.getSeats()) {
            printPlaneInfo(plane3);
        } else {
            printPlaneInfo(plane1);
        }
    }

    public void printAllNotMilitaryPlanes(Plane[] planesArray) {
        for (Plane plane : planesArray) {
            if (plane.isMilitary()) {
                continue;
            }
            printPlaneInfo(plane);
        }
    }

    // print all military planes which were in air more than 100 hours.
    public void printMilitaryPlane(Plane[] planesArray) {
        for (Plane plane : planesArray) {
            if (plane.getHours() > 100) {
                printPlaneInfo(plane);
            }
        }
    }

    public void printPlaneWithMinimalWeight(Plane[] planes) {
        int min = planes[0].getWeight();
        for (int i = 1; i < planes.length - 1; i++) {
            if (planes[i].getWeight() < min) {
                min = planes[i].getWeight();
            }
        }
        for (Plane plane : planes) {
            if (plane.getWeight() == min) {
                printPlaneInfo(plane);
            }
        }
    }

    public void printMilitaryPlaneWithMinimalCost(Plane[] planes) {
        double min = planes[0].getCost();
        for (int i = 1; i < planes.length - 1; i++) {
            if (planes[i].getCost() < min) {
                min = planes[i].getCost();
            }
        }
        for (Plane plane : planes) {
            if (plane.getCost() == min) {
                printPlaneInfo(plane);
            }
        }
    }

    public void printPlanesAscOrderByYear(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j - 1].getYear() > planes[j].getYear()) {
                    Plane tmp = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = tmp;
                }
            }
        }
        for (Plane plane : planes) {
            printPlaneInfo(plane);
        }
    }

    public void printNotMilitaryPlanesDescOrderBySeats(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; i++) {
            if (planes[i].isMilitary())
                continue;
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j - 1].getSeats() > planes[j].getSeats()) {
                    Plane tmp = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = tmp;
                }
            }
        }
        for (int i = planes.length; i > 0; i--) {
            printPlaneInfo(planes[i]);
        }
    }
}

