/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.playlist.music;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author falya amrina zahra
 */
public class Main {

    public static void main( String[] arg)
    {
        Menu menu = new Menu();

        menu.loadPlaylist();
        menu.runMenu();

    }

}