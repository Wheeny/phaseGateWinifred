
function scoreGrading(scoreOne, scoreTwo, scoreThree){
    let average = (scoreOne + scoreTwo + scoreThree)/3;
    
    if(average >= 90 && average <= 100){
        console.log("A");
    }
    else if(average >= 80 && average <= 90){
        console.log("B");
    }
     else if(average >= 70 && average <= 80){
        console.log("C");
    }
     else if(average >= 60 && average <= 70){
        console.log("D");
    }
     else if(average < 60){
        console.log("F");
     }
     
     
    }
   
   
  
scoreGrading()
let scoreOne = 60;
let scoreTwo = 70;
let scoreThree = 50;
    
scoreGrading(scoreOne, scoreTwo, scoreThree);
    
 
    
       
     
    
    
    
