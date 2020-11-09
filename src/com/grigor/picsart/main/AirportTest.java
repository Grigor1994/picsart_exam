package com.grigor.picsart.main;

import com.grigor.picsart.model.Plane;
import com.grigor.picsart.service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlaneService planeService = new PlaneService();

        System.out.println("Input plane 1: ");
        Plane plane1 = new Plane();
        System.out.println("Input model");
        plane1.setModel(sc.nextLine());
        System.out.println("Input country");
        plane1.setCountry(sc.nextLine());
        System.out.println("Input year");
        plane1.setYear(sc.nextInt());
        System.out.println("Input hour: ");
        plane1.setHours(sc.nextInt());
        System.out.println("Is military ");
        plane1.setMilitary(sc.nextBoolean());
        System.out.println("Input engine type");
        plane1.setEngineType(sc.nextLine());
        System.out.println("Input weight: ");
        plane1.setWeight(sc.nextInt());
        System.out.println("Input wings span: ");
        plane1.setWingspan(sc.nextInt());
        System.out.println("Input top speed: ");
        plane1.setTopSpeed(sc.nextInt());
        System.out.println("Input seat counts: ");
        plane1.setSeats(sc.nextInt());
        System.out.println("Input cost: ");
        plane1.setCost(sc.nextDouble());

        System.out.println("Input plane 2: ");
        Plane plane2 = new Plane();
        System.out.println("Input model");
        plane2.setModel(sc.nextLine());
        System.out.println("Input country");
        plane2.setCountry(sc.nextLine());
        System.out.println("Input year");
        plane2.setYear(sc.nextInt());
        System.out.println("Input hour: ");
        plane2.setHours(sc.nextInt());
        System.out.println("Is military ");
        plane2.setMilitary(sc.nextBoolean());
        System.out.println("Input engine type");
        plane2.setEngineType(sc.nextLine());
        System.out.println("Input weight: ");
        plane2.setWeight(sc.nextInt());
        System.out.println("Input wings span: ");
        plane2.setWingspan(sc.nextInt());
        System.out.println("Input top speed: ");
        plane2.setTopSpeed(sc.nextInt());
        System.out.println("Input seat counts: ");
        plane2.setSeats(sc.nextInt());
        System.out.println("Input cost: ");
        plane2.setCost(sc.nextDouble());

        System.out.println("Input plane 3: ");

        Plane plane3 = new Plane();
        System.out.println("Input model: ");
        plane3.setModel(sc.nextLine());
        System.out.println("Input country :");
        plane3.setCountry(sc.nextLine());
        System.out.println("Input year: ");
        plane3.setYear(sc.nextInt());
        System.out.println("Input hour: ");
        plane3.setHours(sc.nextInt());
        System.out.println("Is military: ");
        plane3.setMilitary(sc.nextBoolean());
        System.out.println("Input engine type: ");
        plane3.setEngineType(sc.nextLine());
        System.out.println("Input weight: ");
        plane3.setWeight(sc.nextInt());
        System.out.println("Input wings span: ");
        plane3.setWingspan(sc.nextInt());
        System.out.println("Input top speed: ");
        plane3.setTopSpeed(sc.nextInt());
        System.out.println("Input seat counts: ");
        plane3.setSeats(sc.nextInt());
        System.out.println("Input cost: ");
        plane3.setCost(sc.nextDouble());

        Plane[] planesArray = {plane1, plane2, plane3};

        System.out.println("Print Plane All Information");
        planeService.printPlaneInfo(plane1);
        System.out.println("----------------------------------------------");
        System.out.println("Print plane cost and top speed");
        planeService.printCostAndTopSpeed(plane1);
        System.out.println("----------------------------------------------");
        System.out.println("The plane which one is newer ");
        planeService.printNewerPlane(plane1, plane2);
        System.out.println("----------------------------------------------");
        System.out.println("The model of the plane which has bigger wingspan");
        planeService.getBiggerWingSpanPlane(plane1, plane2);
        System.out.println("----------------------------------------------");
        System.out.println("The plane which has highest cost");
        planeService.printHighestCostPlane(plane1, plane2, plane3);
        System.out.println("----------------------------------------------");
        System.out.println("print country of the plane with smallest seats count");
        planeService.printSmallestSeatsCountOfPlane(plane1, plane2, plane3);
        System.out.println("----------------------------------------------");
        System.out.println("print all not military planes.");
        planeService.printAllNotMilitaryPlanes(planesArray);
        System.out.println("----------------------------------------------");
        System.out.println("print all military planes which were in air more than 100 hours.");
        planeService.printMilitaryPlane(planesArray);
        System.out.println("----------------------------------------------");
        System.out.println("the plane with minimal weight");
        planeService.printPlaneWithMinimalWeight(planesArray);
        System.out.println("----------------------------------------------");
        System.out.println("the plane with minimal cost from all military planes");
        planeService.printMilitaryPlaneWithMinimalCost(planesArray);
        System.out.println("----------------------------------------------");
        System.out.println("print planes in ascending form order by year");
        planeService.printPlanesAscOrderByYear(planesArray);
        System.out.println("----------------------------------------------");
        System.out.println(" print not military planes in descending form order by number of seats.");
        planeService.printNotMilitaryPlanesDescOrderBySeats(planesArray);
    }
}
