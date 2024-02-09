import '../css/Login.css';

const Login = () => {
  return (
    <div className="login-form">
      <h1>Sign In</h1>
      <form>
        <div className="input-group">
          <input type="text" id="username" placeholder="username or e-mail" />
        </div>

        <div className="input-group">
          <input type="password" id="password" placeholder="password" />
        </div>
        <div className="center-container">
        <button type="submit" className="login-button">
          Sign in
        </button>
    </div>
      </form>
    </div>
  );
};

  
  export default Login;