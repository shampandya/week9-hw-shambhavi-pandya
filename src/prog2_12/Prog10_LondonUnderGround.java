package prog2_12;
/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prog10_LondonUnderGround {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, ArrayList<String>> stationLines = new HashMap<>();

            // Adding station data to the map
            addStationInfo(stationLines, "Kings Cross St Pancras", "Victoria", "Northern", "Circle", "Hammersmith & City", "Piccadilly", "Metropolitan");
            addStationInfo(stationLines, "Waterloo", "Bakerloo", "Jubilee", "Northern", "Waterloo & City");

            System.out.println("London Underground Station Information (Zone 1):");
            System.out.println("Enter a station name to see which lines pass through it:");

            while (true) {
                System.out.print("Station Name (or 'exit' to quit): ");
                String stationName = scanner.nextLine();

                if (stationName.equalsIgnoreCase("exit")) {
                    break;
                }

                if (stationLines.containsKey(stationName)) {
                    ArrayList<String> lines = stationLines.get(stationName);
                    System.out.println("Lines passing through " + stationName + ": " + lines);
                } else {
                    System.out.println("Station not found in Zone 1.");
                }
            }

            scanner.close();
        }

        public static void addStationInfo(HashMap<String, ArrayList<String>> stationLines, String stationName, String... lines) {
            ArrayList<String> lineList = new ArrayList<>();
            for (String line : lines) {
                lineList.add(line);
            }
            stationLines.put(stationName, lineList);
        }
    }
