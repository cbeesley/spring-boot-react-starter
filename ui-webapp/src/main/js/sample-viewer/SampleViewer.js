import React from 'react';
import ReactDOM from 'react-dom';

export default class SampleViewer extends React.Component {

    constructor(props) {
        super(props);
        // You should have a prop defined called this.props.viewerId
    }

    render() {
        return (
        <nav className="nav bg-white">
                <a className="nav-link navbar-brand" href="#" style={{color : '#4e9348'}}>I'm a sample viewer</a>
                <a className="nav-link disabled" href="#"><i className="far fa-save"></i></a>
                <a className="nav-link" href="#">Link</a>
                <a className="nav-link disabled" href="#">Disabled</a>
         </nav>
        );
    }
}