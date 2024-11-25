mypromise = new Promise((resolve, reject) => {
    let success = false;
    setTimeout(() => {
        if (success) 
            {
                resolve(`resolved`);
            }
        else {
            reject(` this is the error`);
             }
    }, 2000)
});
