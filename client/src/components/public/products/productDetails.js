
import { Card, CardMedia, CircularProgress, Grid, makeStyles, Paper } from '@material-ui/core';
import React from 'react';
import Carousel from 'react-material-ui-carousel';


const useStyles = makeStyles(theme => ({

    media: {
        height: 0,
        paddingTop: '56.25%',
        backgroundBlendMode: 'darken',
    },
}))

const ProductDetailContent = ({ product }) => {

    const classes = useStyles();
    console.log(product);
    return (
        <div>
            <Grid container >
                <Grid item xs={6}>
                    <h1>{product.name}</h1>
                    <Carousel
                        autoPlay={false}
                        animation={'fade'}
                        autoPlay={false}
                        indicators={true}
                        navButtonsAlwaysVisible={false}
                        navButtonsAlwaysInvisible={false}

                    >
                        {
                            product.images.map(url => {
                                return (
                                    <Card>
                                        <CardMedia className={classes.media} style={{ maxWidth: '500px', minHeight: '100%' }}
                                            image={`${url}`}
                                            title={product.name}
                                        />

                                    </Card>
                                )
                            })
                        }
                    </Carousel>
                </Grid>
                <Grid item xs={6}>
                    <h1>Details infomation</h1>

                </Grid>
            </Grid>
        </div>
    )
}

export default ProductDetailContent;