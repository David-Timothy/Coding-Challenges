function evensy_oddsy(number) {
    var digits = [];

    while (number / 10 > 1) {
        digits.push(number % 10);
        number /= 10;
    }

    var digitsum = 0;
    for (i in digits) {
        digitsum += i;
    }

    if (digitsum % 2 == 0) console.log("Oddsy")
    else console.log("Evensy")
}