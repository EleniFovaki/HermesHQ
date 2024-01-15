const Signup = () => {
  return (
    <div className="register-form">
    <h1>Register</h1>
    <form>
      <div className="input-group">
        <input type="text" id="username" placeholder="username or e-mail" />
      </div>

      <div className="input-group">
        <input type="password" id="password" placeholder="password" />
      </div>
      <div className="center-container">
      <button type="submit" className="login-button">
        Sign up
      </button>
  </div>
    </form>
  </div>
  );
};

export default Signup;