// var loginButton = document.getElementById("login-button");

 
//   loginButton.addEventListener("click", function() 
//   {
   
//     alert("You are logged in, happy shopping!");
    
//   });

document.addEventListener
(
  "DOMContentLoaded", function () 
{
  const loginButton = document.getElementById("login-button");
  loginButton.addEventListener("click", function () 
  {
      const username = document.getElementById("username").value;
      const password = document.getElementById("password").value;

      if (username === "customer" && password === "123") 
      {
          //alert("Welcome, you are logged in. Happy shopping!!!!!!!!");
          window.location.href = "./pages/index.html";
      } else {
          alert("Enterd invalid data");
      }
  }
  );
}
);
