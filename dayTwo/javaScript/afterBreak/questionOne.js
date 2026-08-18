function ageCalc(currentFathersAge, currentSonsAge){
        let numberOfYears = 0;
        if(currentFathersAge/2 > currentSonsAge ) {
            numberOfYears = currentFathersAge - (currentSonsAge*  2);
            
            console.log("The father was twice his son's age " + numberOfYears + "years ago");
            }
            
        else if(currentFathersAge/2 < currentSonsAge ) {
          numberOfYears =   (currentSonsAge*2) - currentFathersAge;
          console.log("The father will be  twice his son's age in " + numberOfYears + " years time");
        }     
    }



ageCalc()
const fathersAge = 38;
const sonsAge = 18;
ageCalc(fathersAge, sonsAge);
    
