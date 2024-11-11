async function fetchData() {
  try {
    let response = await fetch('https://cat-fact.herokuapp.com/facts'); // Pauses until the promise resolves
    let data = await response.json(); // Pauses until JSON is parsed
    console.log(data);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

fetchData(); // Call the async function
