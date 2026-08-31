for (let year = 1900; year <= 2025; year++) {
            
    let isLeapYear = false;

    if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
        isLeapYear = true;
    }

    if (isLeapYear) {
        console.log(year + " is a leap year.");
    }
}
