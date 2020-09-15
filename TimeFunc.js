function resolveAfter2Seconds() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve('called after 2000 milli seconds');
    }, 2000);
  });
}

async function asyncCall() {
  console.log('calling');
  const result = await resolveAfter2Seconds();
  console.log(result);
  // expected output: "resolved"
}

asyncCall();