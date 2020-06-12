function updateFromWeb(){
let username=$('input[name="name"]');
console.log(username);
let password=$('input[name="password"]');
  $.ajax({
    type:'post',
    url:'/hello',
    data:{
      'user':username,
      'password':password,
      'message':'hello!'
    }
  })
}