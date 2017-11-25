/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kdu.test;
import jm.JMC;
import jm.music.data.*;
import jm.util.View;
import jm.util.Write;
import jm.audio.Instrument;

/**
 *
 * @author Lasitha
 */
public class FrequencyToNote implements JMC{
    
	public static void main(String[] args){
		Score s = new Score();
		s.setTempo(60);
		Part p = new Part();
                Phrase phrase = new Phrase();
		//create the phrase note by note
		/*
                 for(int i=0; i<50;i++) {
                    Note n = new Note((int)(Math.random() * 80 + 20),
                                    SEMIBREVE, (int)(Math.random() * 100 + 20));
                    n.setPan(Math.random());
                    Phrase phr = new Phrase(n, Math.random() * 30.0);
                    p.addPhrase(phr);
		}
                 */
                
                for(int i=0; i<20;i++) {
                    Note n = new Note(Math.random() * 1000 + 1000 , 4.0);
                    n.setPan(Math.random());
                    phrase.addNote(n);
//                    Phrase phrase2  = new Phrase(n, Math.random() * 10);
//                    p.addPhrase(phrase2);
                }
                
                p.addPhrase(phrase);
		s.addPart(p);

		Instrument inst = new SineInst(22000);
		Write.midi(s,"SineTest.mid");

                View.print(s);
	}

}
