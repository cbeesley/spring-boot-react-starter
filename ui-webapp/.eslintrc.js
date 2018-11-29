module.exports = {
    "env": {
        "browser": true,
        "es6": true
    },
	"parser": "babel-eslint",
    "parserOptions": {
        "ecmaVersion": 6,
        "ecmaFeatures": {
            "experimentalObjectRestSpread": true,
            "jsx": true
        },
        "sourceType": "module"
    },
    "plugins": [
        "react"
    ],
    "rules": {
        "no-unused-vars" : "off",
        "indent": ["error", 4],

        "linebreak-style": [
                "error",
                "unix"
            ]
     }
};
