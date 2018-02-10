import requests;
import os;
import json;

url = "https://translation.googleapis.com/language/translate/v2?key=" + os.environ['G_API_KEY']

request = json.dumps({
  'q': 'The quick brown fox jumped over the lazy dog.',
  'source': 'en',
  'target': 'es',
  'format': 'text'
})

response = requests.post(url, request)
print response.content
