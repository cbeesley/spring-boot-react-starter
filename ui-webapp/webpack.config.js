const webpack = require('webpack');
const path = require('path');

module.exports = {
    mode : 'development',
    // uncomment devtool to generate source maps for debugging eval-source-map | sourcemaps
    devtool : 'eval-source-map',
    entry: {
        sample_viewer : './src/main/js/sample-viewer/app.js',
        navbar : './src/main/js/navbar/app.js'
    },
    module: {
        rules: [{
            test: /\.(js|jsx)$/,
            exclude: /node_modules/,
            use: ['babel-loader']
        }
        ]
    },
    resolve: {
        extensions: ['*', '.js', '.jsx']
        },
    output: {
        // Change this to deploy to a content server or deploy into the static resource area of the spring boot app
        path: '/Users/chrisbeesley/Documents/regenworkspace/spring-boot-react-starter/ui-webapp/src/main/resources/static/js',
        publicPath: '/',
        filename: '[name].js'
    },
    plugins : [
    new webpack.LoaderOptionsPlugin({
        debug: true
      }),
      new webpack.SourceMapDevToolPlugin({
      exclude: 'vendor'
      })
    ]

};path.resolve(__dirname, '../src/main/resources/static/js')