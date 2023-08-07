for (let num = 1; num < 100; num++) {
    if (num % 3 === 0){
        console.log('3の倍数です');
    }else if(num % 5 === 0) {
        console.log('5の倍数です');
    }else if (num % 3 === 0 && num % 5 ===0) {
        console.log('3と５の倍数です');
    }else {
        console.log(num);
    }
}