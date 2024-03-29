package com.learningJava;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();


    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's go", 4.3);
        album.addSong("Inject the venom", 4.51);
        album.addSong("Snowballed", 3.21);
        album.addSong("Evil walks", 6.23);
        album.addSong("C.O.D", 4.27);
        album.addSong("Breaking the rules", 4.2);
        album.addSong("Night of the long knives", 3.13);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy Man", playList);
        albums.get(0).addToPlaylist("Speed King", playList); // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // Does not exist

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while (!quit) {
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("At start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("At the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid option, use 0 - 5");
            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> i = playList.iterator();
        // Iterator doesn't allow for forward and backward movement like listIterator.
        // Good for looping through object once.
        System.out.println("=====================");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=====================");
//        for (Song song : playList) {
//            System.out.println(song.toString());
//        }
    }

    private static void printMenu() {
        System.out.println("Select action\n0-exit\n1-next\n2-previous\n3-replay\n4-show playlist\n5-show menu\n6-delete current song");
    }
}
