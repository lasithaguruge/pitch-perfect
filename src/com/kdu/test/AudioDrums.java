/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kdu.test;

import javax.swing.JFrame;
import jm.JMC;
import jm.util.*;
import jm.music.data.*;
import jm.audio.*;

/**
 *
 * @author Lasitha
 */
public class AudioDrums extends JFrame implements JMC {

    private double sliderVal;

    Score s = new Score("title");
    Part kickPart = new Part("Kick", 0, 9);
    Part snarePart = new Part("Snare", 1, 9);
    Part hatsPart = new Part("Hats", 2, 9);
    Part openHatsPart = new Part("OpenHats", 3, 9);
    Phrase kickPhrase = new Phrase();
    Phrase snarePhrase = new Phrase();
    Phrase hatsPhrase = new Phrase();
    Phrase openHatsPhrase = new Phrase();

    SimpleSampleInst kickInst = new SimpleSampleInst("Kick.au", FRQ[36]);
    SimpleSampleInst snareInst = new SimpleSampleInst("Snare.au", FRQ[38]);
    SimpleSampleInst hatsInst = new SimpleSampleInst("Hats.au", FRQ[42]);
    SimpleSampleInst openHatsInst = new SimpleSampleInst("HHOpen.au", FRQ[46]);
    Instrument[] drumKit = {kickInst, snareInst, hatsInst, openHatsInst};

    public void beatGenerate(double slider) {
        // kick 
        for (int i = 0; i < 20; i++) {
            Note n = new Note(36, 2.0);
            kickPhrase.addNote(n);
            // kickPhrase.setTempo(slider);
        }

        for (int i = 0; i < 20; i++) {
            //snare
            Note r = new Note(REST, 1.0);
            snarePhrase.addNote(r);
            Note n = new Note(38, 1.0);
            n.setDuration(n.getRhythmValue());
            snarePhrase.addNote(n);
            //snarePhrase.setTempo(slider);
        }

        for (int i = 0; i < 160; i++) {
            //hats
            if (i % 2 == 1 && Math.random() < 0.1) {
                Note n = new Note(46, 0.25, (int) (Math.random() * 127));
                n.setDuration(n.getRhythmValue());
                openHatsPhrase.addNote(n);
                Note r = new Note(REST, 0.25);
                hatsPhrase.addNote(r);
                // hatsPhrase.setTempo(slider);
            } else {
                Note n = new Note(42, 0.25, (int) (Math.random() * 127));
                n.setDuration(n.getRhythmValue());
                hatsPhrase.addNote(n);
                Note r = new Note(REST, 0.25);
                openHatsPhrase.addNote(r);
                //openHatsPhrase.setTempo(slider);
            }
        }
        //pack
        kickPart.addPhrase(kickPhrase);
        snarePart.addPhrase(snarePhrase);
        hatsPart.addPhrase(hatsPhrase);
        openHatsPart.addPhrase(openHatsPhrase);

        s.addPart(kickPart);
        s.addPart(snarePart);
        s.addPart(hatsPart);
        s.addPart(openHatsPart);
        s.setTempo(slider);
        
        Play.stopMidi();
        Play.audio(s, drumKit);
        //write midi
        Write.midi(s, "AudioDrums.mid");
//
//        //write au
//        Write.au(s, "AudioDrums.au", drumKit);
        // Audio.processScore(s, drumKit, "");
        //Play.audioClip("AudioDrums.au");

    }

    public double getSliderVal() {
        return sliderVal;
    }

    public void setSliderVal(double sliderVal) {
        this.sliderVal = sliderVal;
    }

}
