let leapYearCount = 0;

for (let year = 1900; year <= 2025; year++) {
            

    if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
        leapYearCount++; 
    }

    }
    
    console.log("Total leap years between 1900 and 2025: " + leapYearCount);
    








