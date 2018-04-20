package com.company;

import com.github.javafaker.Faker;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of mock users to be created: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        for (int i = number ; i > 0 ; i--) {

            NewUser user = new NewUser();
        }

            }




        }


