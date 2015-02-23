/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4se;

/**
 * @version 23/02/15
 * @author 1301147
 */

import java.util.SortedMap;
import java.util.TreeMap;

public class GeneralDictionary implements Dictionary{

    private SortedMap <String, String> map;
    
    public GeneralDictionary(){
        map = new TreeMap<String, String>();
        map.put("book", "a set of printed pages, bound with a cover");
        map.put("editor", " a person who edits");
    }
    
    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }
    
    
    
}
