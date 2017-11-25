/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kdu.test;

/**
 *
 * @author Lasitha
 */
import jm.JMC;
import jm.music.data.*;
import jm.util.Play;
import javax.swing.*;
import java.awt.event.*;

class PlaybackTest implements ActionListener, JMC {

    private Score score;
    private int cnt = 1;

    public static void main(String[] args) {
        new PlaybackTest();
    }

    public PlaybackTest() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Play");
        button.addActionListener(this);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    public void playScore() {
        updatePhrase();
        System.out.println("Playing times: " + cnt++);
        // Play.midi() arguments -
        /* @param score The score to be played.
         * @param exit Close playback when done? true or false. 
        * @param wait Hold program open for the duration of playback? True or false
        * @param synths The number of the MidiSynths to use - default is 1. */
        // use the third argument as true only if you don't have a GUI to keep the program open during playback.
        // can use 2 as 4th argument to prevent release tails of phrase ends being cut off
        // but this may mean more initalising which distors the timing of the first few notes.
        Play.midi(score);
    }

    private void updatePhrase() {
        Phrase phr = new Phrase();
        phr.addNote(new Note((int) (Math.random() * 20) + 60, 0.25));
        phr.addNote(new Note((int) (Math.random() * 20) + 60, 0.25));
        phr.addNote(new Note((int) (Math.random() * 20) + 60, 0.5));
        score = new Score(new Part(phr));
    }

    public void actionPerformed(ActionEvent e) {
        playScore();
    }
}
