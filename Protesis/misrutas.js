const express = require('express');
const router = express.Router();
//
const miscontroles = require('./miscontroles');

router
    //login
    .get("/login", miscontroles.getIndex);
  

module.exports = router;