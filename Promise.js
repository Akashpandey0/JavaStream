// const myPromise = new Promise((res, rej) => {
//     setTimeout(() => {
//         res('I am a promise!')
//     }, 2000)
// });

// myPromise.then((message) => {
//     console.log(message)
// }).catch((error) => {
//     console.error(error)
// });

count = 0;

const intervalId = setInterval(() => {
    console.log('This will run every 3 seconds');

    count++;
    if(count == 5) {
        clearInterval(intervalId);
        console.log('Interval stops after 5 executions');
    }
}, 3000);