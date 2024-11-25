mypromise = new Promise((resolve, reject) => {
    let success = true;
    setTimeout(() => {
        if (!success) {
            resolve(`resolved`);
            
        }