package com.ag.collection.Map;

public class Map_Rule {
	// METHOD 1:           While ke through iterate  ; lengthy method hai

	// direct MAP ke pass iterator ka object hai hi nhi
	//  map ke andar iterate hamesa Set ke through object bana kr krte hai 

	//   Set set = ___Map.enrty();
}
    //   Iterator itr = set.iterator(); 
    //  while(itr.hasNext()){
    //        System.out.println(int.next);  }
                                           // agar srif value ya key niklna ho to
          //Iterator itr = set.iterator(); 
          //  while(itr.hasNext()){
                                         // ye line add krni hogi
    //      Map.Entry<Student,String>  entry = (Map.Entry<Student,String>)itr.next();
           //        System.out.println(entry.getKey();
           // System.out.println(entry.getValue();
   // or  System.out.println(entry.getkey()+" "+entry.getValue());

 // METHOD :  2          For Each ke through ; just in two line mein complete  
  
//     for(Map.Entry<Student,String>  entry ::: (Map.Entry<Student,String>)itr.next()


// method : 3      Advance for each  ;              BEST

//   tree__Map.foreach((key,value)->{System.out.println(key +""+ value)});