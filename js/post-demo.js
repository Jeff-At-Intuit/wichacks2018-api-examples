const fetch = require('node-fetch');

fetch('https://translation.googleapis.com/language/translate/v2?key=' + process.env.G_API_KEY, {
  method: 'POST', // or 'PUT'
  body: JSON.stringify({
  'q': 'The quick brown fox jumped over the lazy dog.',
  'source': 'en',
  'target': 'es',
  'format': 'text'
  }),
  headers: new fetch.Headers({
    'Content-Type': 'application/json'
  })})
  .then(response => response.json())
  .then(json => console.log(JSON.stringify(json, null, 2)))
